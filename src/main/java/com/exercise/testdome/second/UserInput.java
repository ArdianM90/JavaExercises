package com.exercise.testdome.second;

public class UserInput {

    public static class TextInput {
        private final String input;
        protected final StringBuilder sb;

        public TextInput() {
            this.input = "";
            this.sb = new StringBuilder(input);
        }

        public void add(char c) {
            this.sb.append(c);
        }

        public String getValue() {
            return sb.toString();
        }
    }

    public static class NumericInput extends TextInput {

        public NumericInput() {
            super();
        }

        @Override
        public void add(char c) {
            if (String.valueOf(c).matches("[0-9]")) {
                this.sb.append(c);
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
