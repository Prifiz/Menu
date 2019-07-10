package entities;

import java.util.ArrayList;
import java.util.List;

public class CookingInstruction {

    private String comment;
    private List<String> steps;

    public CookingInstruction() {
        this.steps = new ArrayList<>();
        this.comment = "";
    }

    public CookingInstruction addStep(String stepDescription) {
        this.steps.add(stepDescription);
        return this;
    }

    public CookingInstruction addComment(String comment) {
        this.comment.concat(comment);
        return this;
    }

    public CookingInstruction replaceComment(String comment) {
        this.comment = comment;
        return this;
    }

}
