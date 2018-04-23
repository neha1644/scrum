/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumproj;

/**
 *
 *
 */
class Sprints {
    public Task tasks[];

    public Sprints(Task t[]) {
        tasks = t;
    }
    
     public void printSprintBlog(){
        for(int i =0 ; i<tasks.length;i++){
            System.out.println("\n"+tasks[i].task+" | "+tasks[i].status+" | "+tasks[i].hours);
        }
    }
    
}
