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

public class classroom {
    private String classRoomName;
    private String teacherName;

    public static void main(String [] args)
    {
        
    }
    public void setClassRoomName(String newClassRoomName) {
        classRoomName = newClassRoomName;

    }

    public String returnClassRoomName() {
        return classRoomName;
    }

    public void setTeacherName(String newTeacherName) {
        teacherName = newTeacherName;

    }

    public String returnTeacherName() {
        return teacherName;
    }
}