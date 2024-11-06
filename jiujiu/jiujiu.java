public class jiujiu {
    public static void main(String[] args) {
        int i=1;
        //对行变量赋值
        int j=1;
        //对列变量赋值
        for(i=1;i<=9;i++){
            for(j=1;j<=i;j++){
                //行变量外循环；列变量内循环
                System.out.print(i+"*"+j+"="+i*j+"\t");
                //输出表达式,用\t保持一定距离
            }
            System.out.println();
            // 换行
        }

    }
}
