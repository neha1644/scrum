package scrumproj;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitTestTest {

	@Test
	public void test() {
		Owner owner = new Owner("NEHA");
        ScrumMater sm = new ScrumMater("BOI");
        String memebers[] = {"RI","NEH"};
        TeamMembers tm = new TeamMembers(memebers);
        
        UserStory us[] = new UserStory[2];
        us[0] = new UserStory(" user i want to.", 2, 3);
        us[1] = new UserStory(" user i want to..", 1, 4);
        
        ProductBacklog pblog = new ProductBacklog(us);
        
        Task tsk[] = new Task[2];
        tsk[0] = new Task("task 1", "To Do", 3);
        tsk[1] = new Task("task 2", "Doing rightnow", 3);
        
        Sprints slog = new Sprints(tsk);
        
        Project pro = new Project("Myproject",owner,sm,tm,pblog,slog);
        
        pro.pbacklock.printProductBlog();
         pro.sbacklock.printSprintBlog();
	}

}
