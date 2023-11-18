package at.webdreamsolution.taskplanner.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {
    private String name;
    private Status status;
}
