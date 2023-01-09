package io.spectralpowered.injector.utils.parser;

import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class StringReader {

    private static final char QUOTE_CHAR = '"';

    private final String string;
    private int cursor;

    public StringReader(String string) {
        this(string, 0);
    }

    public StringReader(String string, int cursor) {
        this.string = string;
        this.cursor = cursor;
    }

    public int getCursor() {
        return cursor;
    }

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }

    public boolean canRead() {
        return canRead(1);
    }

    public boolean canRead(int amount) {
        return cursor + amount <= string.length();
    }

    public char peek() {
        return peek(0);
    }

    public char peek(int offset) {
        return string.charAt(cursor + offset);
    }

    public String peekString(int length) {
        if (cursor + length > string.length()) throw new IllegalArgumentException("Cannot read " + length + " characters from cursor position");
        return string.substring(cursor, cursor + length);
    }

    public String peekString() {
        int start = cursor;
        String s = readString();
        cursor = start;
        return s;
    }

    public void skip() {
        skip(1);
    }

    public void skip(int amount) {
        cursor += amount;
    }

    public void ensureNext(char c, boolean allowEnd) {
        if (!canRead()) {
            if (!allowEnd) throw new IllegalStateException("Expected '" + c + "' but got end");
            else return;
        }
        if (peek() != c) throw new IllegalStateException("Expected '" + c + "' but got '" + peek() + "'");
    }

    public char read() {
        return string.charAt(cursor++);
    }

    public String readAll() {
        String all = string.substring(cursor);
        cursor = string.length();
        return all;
    }

    public String readUntil(char c) {
        StringBuilder builder = new StringBuilder();
        while (canRead() && peek() != c) builder.append(read());
        skip();
        return builder.toString();
    }

    public String readString() {
        if (!canRead()) return "";

        if (peek() == StringReader.QUOTE_CHAR) return readQuotedString();
        else return readUnquotedString();
    }

    public String readUnquotedString() {
        return readUntil(' ');
    }

    public String readQuotedString() {
        ensureNext(StringReader.QUOTE_CHAR, false);
        skip();
        String s = readUntil(StringReader.QUOTE_CHAR);
        ensureNext(' ', true);
        skip();
        return s;
    }

    public boolean readBoolean() {
        int start = cursor;
        String s = readString();
        if (s.equalsIgnoreCase("true")) {
            return true;
        } else if (s.equalsIgnoreCase("false")) {
            return false;
        } else {
            cursor = start;
            throw new IllegalStateException("Expected boolean but got '" + s + "'");
        }
    }

    public byte readByte() {
        int start = cursor;
        String s = readString();
        if (s.toLowerCase().endsWith("b")) s = s.substring(0, s.length() - 1);
        try {
            return Byte.parseByte(s);
        } catch (NumberFormatException e) {
            cursor = start;
            throw new IllegalStateException("Expected byte but got '" + s + "'");
        }
    }

    public boolean canReadByte(boolean requireSuffix) {
        try {
            int start = cursor;
            readByte();
            cursor = start;
            return !requireSuffix || peekString().toLowerCase(Locale.ROOT).endsWith("b");
        } catch (Throwable ignored) {
        }
        return false;
    }

    public short readShort() {
        int start = cursor;
        String s = readString();
        if (s.toLowerCase().endsWith("s")) s = s.substring(0, s.length() - 1);
        try {
            return Short.parseShort(s);
        } catch (NumberFormatException e) {
            cursor = start;
            throw new IllegalStateException("Expected short but got '" + s + "'");
        }
    }

    public boolean canReadShort(boolean requireSuffix) {
        try {
            int start = cursor;
            readShort();
            cursor = start;
            return !requireSuffix || peekString().toLowerCase(Locale.ROOT).endsWith("s");
        } catch (Throwable ignored) {
        }
        return false;
    }

    public int readInt() {
        int start = cursor;
        String s = readString();
        if (s.toLowerCase().endsWith("i")) s = s.substring(0, s.length() - 1);
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            cursor = start;
            throw new IllegalStateException("Expected integer but got '" + s + "'");
        }
    }

    public boolean canReadInt(boolean requireSuffix) {
        try {
            int start = cursor;
            readInt();
            cursor = start;
            return !requireSuffix || peekString().toLowerCase(Locale.ROOT).endsWith("i");
        } catch (Throwable ignored) {
        }
        return false;
    }

    public long readLong() {
        int start = cursor;
        String s = readString();
        if (s.toLowerCase().endsWith("l")) s = s.substring(0, s.length() - 1);
        try {
            return Long.parseLong(s);
        } catch (NumberFormatException e) {
            cursor = start;
            throw new IllegalStateException("Expected long but got '" + s + "'");
        }
    }

    public boolean canReadLong(boolean requireSuffix) {
        try {
            int start = cursor;
            readLong();
            cursor = start;
            return !requireSuffix || peekString().toLowerCase(Locale.ROOT).endsWith("l");
        } catch (Throwable ignored) {
        }
        return false;
    }

    public float readFloat() {
        int start = cursor;
        String s = readString();
        if (s.toLowerCase().endsWith("f")) s = s.substring(0, s.length() - 1);
        try {
            return Float.parseFloat(s);
        } catch (NumberFormatException e) {
            cursor = start;
            throw new IllegalStateException("Expected float but got '" + s + "'");
        }
    }

    public boolean canReadFloat(boolean requireSuffix) {
        try {
            int start = cursor;
            readFloat();
            cursor = start;
            return !requireSuffix || peekString().toLowerCase(Locale.ROOT).endsWith("f");
        } catch (Throwable ignored) {
        }
        return false;
    }

    public double readDouble() {
        int start = cursor;
        String s = readString();
        if (s.toLowerCase().endsWith("d")) s = s.substring(0, s.length() - 1);
        try {
            return Double.parseDouble(s);
        } catch (NumberFormatException e) {
            cursor = start;
            throw new IllegalStateException("Expected double but got '" + s + "'");
        }
    }

    public boolean canReadDouble(boolean requireSuffix) {
        try {
            int start = cursor;
            readDouble();
            cursor = start;
            return !requireSuffix || peekString().toLowerCase(Locale.ROOT).endsWith("d");
        } catch (Throwable ignored) {
        }
        return false;
    }

    public int readOpcode() {
        try {
            return readInt();
        } catch (Throwable t) {
            return StringParser.OPCODES.get(readString().toUpperCase(Locale.ROOT));
        }
    }

    public Type readType() {
        if (!peekString(5).equalsIgnoreCase("type(")) throw new IllegalStateException("Expected type but got '" + peekString(4) + "'");
        skip(5);
        String type = readString();
        if (type.charAt(type.length() - 1) != ')') throw new IllegalStateException("Expected ')' but got '" + type.charAt(type.length() - 1) + "'");
        return Type.getType(type.substring(0, type.length() - 1));
    }

    public Handle readHandle() {
        if (!peekString(7).equalsIgnoreCase("handle(")) throw new IllegalStateException("Expected handle but got '" + peekString(6) + "'");
        skip(7);
        int opcode = readOpcode();
        String owner = readString();
        String name = readString();
        String descriptor = readString();
        String sIsInterface = readUntil(')');
        boolean isInterface;
        if (sIsInterface.equalsIgnoreCase("true")) isInterface = true;
        else if (sIsInterface.equalsIgnoreCase("false")) isInterface = false;
        else throw new IllegalStateException("Expected boolean but got '" + sIsInterface + "'");
        skip();

        return new Handle(opcode, owner, name, descriptor, isInterface);
    }

    public ConstantDynamic readConstantDynamic() {
        if (!peekString(9).equalsIgnoreCase("cdynamic(")) throw new IllegalStateException("Expected cdynamic but got '" + peekString(8) + "'");
        skip(9);
        String name = readString();
        String descriptor = readString();
        Handle handle = readHandle();
        List<Object> bootstrapMethodArguments = new ArrayList<>();
        while (canRead()) bootstrapMethodArguments.add(readConstantPoolEntry());

        return new ConstantDynamic(name, descriptor, handle, bootstrapMethodArguments.toArray(new Object[0]));
    }

    public Object readConstantPoolEntry() {
        if (canReadInt(true)) return readInt();
        else if (canReadFloat(true)) return readFloat();
        else if (canReadLong(true)) return readLong();
        else if (canReadDouble(true)) return readDouble();
        else if (peekString().toLowerCase(Locale.ROOT).startsWith("type(")) return readType();
        else if (peekString().toLowerCase(Locale.ROOT).startsWith("handle(")) return readHandle();
        else if (peekString().toLowerCase(Locale.ROOT).startsWith("cdynamic(")) return readConstantDynamic();

        try {
            return readInt();
        } catch (Throwable t) {
            return readString();
        }
    }

}
