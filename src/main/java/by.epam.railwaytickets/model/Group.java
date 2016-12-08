package by.epam.railwaytickets.model;

import java.util.List;
import java.util.Objects;

/**
 * Created by Volha_Shakhrai on 12/7/2016.
 */
public class Group {
    private int id;
    private String title;
    private List<User> members;

    public Group() {
    }

    public Group(int id, String title, List<User> members) {
        this.id = id;
        this.title = title;
        this.members = members;
    }

    public Group(String title) {
        this.title = title;
    }

    public Group(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Group group = (Group) o;
        return id == group.id &&
                Objects.equals(title, group.title) &&
                Objects.equals(members, group.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, members);
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", members=" + members +
                '}';
    }
}
