package entities;

public enum Unit {

    // TODO add converter!

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
