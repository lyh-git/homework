package day0602;

/**
 * @author HUA
 */
/*编写一个类Book，代表教材:
        具有属性：名称（title）、页数（pageNum），其中页数不能少于200页，否则输出错误信息，并赋予默认值200
        为各属性设置赋值和取值方法
        具有方法:detail，用来在控制台输出每本教材的名称和页数
        编写测试类BookTest进行测试：为Book对象的属性赋予初始值，并调用Book对象的detail方法，看看输出是否正确*/
public class Book {
    private String title;
    private int pageNum = 200;
    public Book() {
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {

        this.title = title;
    }
    public int getPageNum() {
        return pageNum;
    }
    public void setPageNum(int pageNum) {
        if (pageNum < 200) {
            System.out.println("页数有误");
            this.pageNum = 200;
        }
    }

    public void detail() {
        System.out.println("教程：" + title + " 页数：" + pageNum);
    }

}
