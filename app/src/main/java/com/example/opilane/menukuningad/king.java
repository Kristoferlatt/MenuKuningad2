package com.example.opilane.menukuningad;

public class king {
    public king(String s, int i, int i1) {
    }

    public class kings {
        private String name, text;
        private int from, to;

        public kings(String name, int from, int to) {
            this.name = name;
            this.from = from;
            this.to = to;
            this.text= text;
        }

        public String getName() {
            return name;
        }

        public int getFrom() {
            return from;
        }

        public int getTo() {
            return to;
        }

        public String getText() {
            return text;
        }

        @Override
        public String toString() {
            return name;
        }
        public String getking(){
            return name + "regin from" + from + "to" + to;
        }
    }
}
