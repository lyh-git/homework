package day0606.dome03;

import java.util.ArrayList;
import java.util.List;

public class Course extends CourseInfo {


private String[][] allCourses={
        {"理论课","T001","JAVA基础","","",""},
        {"理论课","T002","Javaweb","","",""},
        {"项目课程","P001","Oracle","CMS系统","1个月",""},
        {"项目课程","P002","SSM框架","OA系统","2个月",""},
        {"视频课程","V001","Hadoop","","","20分钟"},
        {"视频课程","V002","大数据","","","30分钟"}};

    public static void main(String[] args) {
        CourseInfo [] courseInfos=new  CourseInfo[6];
        courseInfos[0]=new ProjectClass("理论课","T001","JAVA基础","","","");
        courseInfos[1]=new ProjectClass("理论课","T002","Javaweb","","","");
        courseInfos[2]=new Theoryclass("项目课程","P001","Oracle","CMS系统","1个月","");
        courseInfos[3]=new Theoryclass("项目课程","P002","SSM框架","OA系统","2个月","");
        courseInfos[4]=new VideoClass("视频课程","V001","Hadoop","","","20分钟");
        courseInfos[5]=new VideoClass("视频课程","V002","大数据","","","30分钟");
        for (CourseInfo courseInfo : courseInfos) {
            System.out.println(courseInfo);
        }

    }
}
