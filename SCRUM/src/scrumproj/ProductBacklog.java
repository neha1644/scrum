/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumproj;

/**
 *
 
 */
class ProductBacklog {
    public UserStory us[];

    public ProductBacklog(UserStory u[]) {
        us = u;
    }
    
    public void printProductBlog(){
        for(int i =0 ; i<us.length;i++){
            System.out.println("\n"+us[i].story+" | "+us[i].point+" | "+us[i].priority);
        }
    }
    
}
