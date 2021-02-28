package Proiect.Builder_Template;

public class WandBuilder {
    //required parameters
    private final WandFlexibility wandFlexibility;
    private final WandLength wandLength;
    private final float price;
    private final String name;
    private final Characters characters;
    //optional parameters
    private final WandCores wandCores;
    private final WandWood wandWood;



    //constructor
    public WandBuilder(Builder builder) {
        this.wandFlexibility = builder.wandFlexibility;
        this.name = builder.name;
        this.wandLength = builder.wandLength;
        this.wandCores = builder.wandCores;
        this.wandWood = builder.wandWood;
        this.characters = builder.characters;
        this.price=builder.price;
    }

    //getters
    public WandFlexibility getWandFlexibility() {
        return wandFlexibility;
    }

    public float getPrice() {
        return price;
    }

    public Characters getWandName() {
        return characters;
    }

    public String getName() {
        return name;
    }

    public WandLength getWandLength() {
        return wandLength;
    }

    public WandCores getWandCores() {
        return wandCores;
    }

    public WandWood getWandWood() {
        return wandWood;
    }

    @Override
    public String toString() {
        var var = new StringBuilder();
        var.append("This is ")
                .append(characters)
                .append("'s wand named ")
                .append(name);

        if (wandCores != null) {
            var.append(" with the core ").append(wandCores);
        }
        if (wandFlexibility != null) {
            var.append(" and it's flexibility is ").append(wandFlexibility);

        }
        if (wandLength != null) {
            var.append(". Wand's length is ").append(wandLength).append(" inches");

        }
        if (wandWood != null) {
            var.append(" and it's made from ").append(wandWood).append(" wood");
        }

        if(price != 0){
            var.append(". The wand price is:").append(price);
        }
        var.append('.');
        return var.toString() ;
    }



    public static class Builder {
        public String name;
        private WandFlexibility wandFlexibility;
        private WandLength wandLength;
        private WandCores wandCores;
        private WandWood wandWood;
        private Characters characters;
        private final float price;

        public Builder(Characters charName, String name, float price) {
            if (charName == null || name == null) {
                throw new IllegalArgumentException("Name cannot be null");
            }
            this.characters = charName;
            this.name = name;
            this.price=price;

        }

        public Builder withWandCores(WandCores wandCores) {
            this.wandCores = wandCores;
            return this;
        }

        public Builder withWandFlexibility(WandFlexibility wandFlexibility) {
            this.wandFlexibility = wandFlexibility;
            return this;
        }

        public Builder withWandLength(WandLength wandLength) {
            this.wandLength = wandLength;
            return this;
        }

        public Builder withWandWood(WandWood wandWood) {
            this.wandWood = wandWood;
            return this;
        }

        public WandBuilder build() {
            return new WandBuilder(this);
        }

    }
}

