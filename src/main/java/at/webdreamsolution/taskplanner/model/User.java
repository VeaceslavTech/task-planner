package at.webdreamsolution.taskplanner.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class User {

    private String name;
    private String lastName;
    private String nickName;
    private LocalDate birthDay;
    private TaskList myTasks;
}
