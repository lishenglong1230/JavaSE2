package Note0614_Array.ArrayTest11;
/*
    二维数组的遍历
 */
public class ArrayTest11 {
    public static void main(String[] args) {
        String[][] array={
                {"java","oracle","c++","python","c#"},
                {"张三","李四","王五"},
                {"lucy","jack","rose"}
        };
        //遍历二维数组
        for (int i = 0; i < array.length; i++) {//外层循环3次。(腐恶纵向)
            //负责遍历一维数组
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" ");
            }
            //换行
            System.out.println();
        }
    }
}
