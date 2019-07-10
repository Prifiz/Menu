package entities;

public enum Unit {

    PCS, GRAMS, PARTS, BOWLS, ML;

    private String name;
    private String comment;

    Unit(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }

    Unit() {

    }

}
