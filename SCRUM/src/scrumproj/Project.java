/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumproj;


class Project {
    public String name;
    public Owner owner;
    public ScrumMater sm;
    public TeamMembers tm;
    
    public ProductBacklog pbacklock;
    
    public Sprints sbacklock;

    public Project(String n, Owner o, ScrumMater s, TeamMembers t, ProductBacklog bl, Sprints sp) {
        name = n;
        owner = o;
        sm = s;
        tm = t;
        pbacklock = bl;
        sbacklock = sp;
    }
    
    public String getProjectName(){
        return name;
    }
    
    public String getOwnerName(){
        return owner.name;
    }
    
    public String getScrumMaterName(){
        return sm.name;
    }
    
}
