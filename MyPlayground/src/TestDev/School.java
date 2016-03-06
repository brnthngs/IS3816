/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestDev;

/**
 *
 * @author wetteb
 */
import java.util.ArrayList;

public class School {
    private ArrayList<classroom> classrooms;
    private String classRoomName;
    private String teacherName;

    public School() {
        classrooms = new ArrayList<classroom>();
    }

    public void addClassRoom(classroom newClassRoom, String theClassRoomName) {
        classrooms.add(newClassRoom);
        classRoomName = theClassRoomName;
    }

    // how to write a method to add a teacher to the classroom by using the
    // classroom parameter
    // and the teachers name
}  
