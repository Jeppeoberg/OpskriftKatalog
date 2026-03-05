public abstract class Opskrifter {

        private String name;
        private DietType dietType;

        public Opskrifter(String name, DietType dietType) {
            this.name = name;
            this.dietType = dietType;
        }

        public DietType getDietType() {
            return dietType;
        }
    }

