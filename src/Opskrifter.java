public abstract class Opskrifter {

        private String name;
        private boolean containsMeat;

        public Recipe(String name, boolean containsMeat) {
            this.name = name;
            this.containsMeat = containsMeat;
        }

        public String getName() {
            return name;
        }

        public boolean containsMeat() {
            return containsMeat;
        }
    }

