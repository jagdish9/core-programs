package programs.enumverify;

public enum Operation {
    ADD {
        @Override
        public int apply(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT {
        @Override
        public int apply(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY {
        @Override
        public int apply(int a, int b) {
            return a * b;
        }
    },
    DIVISION {
        @Override
        public int apply(int a, int b) {
            return a > b ? a / b : b / a;
        }
    };

    public abstract int apply(int a, int b); // Abstract method
}
