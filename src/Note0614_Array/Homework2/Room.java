package Note0614_Array.Homework2;
/*
    酒店的房间
 */
public class Room {
    /**
     * 房间编号
     * 1楼：101 102 103 104 105 106..
     * 2楼：201 202 203 204 205 206..
     * 3楼：301 302 303 304 305 306.。
     */
    private int no;
    /**
     * 房间类型：标准件 单人间 总统套房
     */
    private String type;
    /**
     * 房间状态。
     * true表示空闲，房间可以被预定。
     * false表示占用，房间不能被预定。
     */
    private boolean status;
    //构造方法：
    public Room() {
    }
    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }
    //setter and getter
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean equals(Object obj){
        if(obj==null||!(obj instanceof Room)) return false;
        if(this==obj) return true;
        Room room=(Room)obj;
        return this.no == room.getNo();
    }

    public String toString(){
        return "["+no+","+type+","+(status ? "空闲":"占用")+"]";
    }
}
