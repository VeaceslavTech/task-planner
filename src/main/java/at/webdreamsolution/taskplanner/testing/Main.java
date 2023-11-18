package at.webdreamsolution.taskplanner.testing;

import at.webdreamsolution.taskplanner.model.Status;
import at.webdreamsolution.taskplanner.model.Task;
import at.webdreamsolution.taskplanner.model.TaskList;
import at.webdreamsolution.taskplanner.model.User;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TaskList user1TaskList = new TaskList();
        User user1 = new User("Slavik","Ivanov","Xzibit23", LocalDate.of(1996,7,1),user1TaskList);
        Task task1 = new Task();
        task1.setStatus(Status.IN_PROGRESS);
        task1.setName("Rdo");
        user1TaskList.getCurrentTasks().add(task1);
        System.out.println(user1.getMyTasks().getCurrentTasks().size());
        System.out.println(user1.getMyTasks().getCurrentTasks().get(0).getName());
    }
}
