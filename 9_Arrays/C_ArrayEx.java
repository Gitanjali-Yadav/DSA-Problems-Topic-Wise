public class C_ArrayEx {
    public static void main(String[] args) {
        int marks[]={91,94,96};
        int const_val=5;

        System.out.println("Physics Marks = " + marks[0]);//91
        System.out.println("Math Marks = " + marks[1]);//94
        System.out.println("Chem Marks = " + marks[2]);//96
        System.out.println("const_val  = " + const_val);//5-call by value
        update(marks, const_val);//10
        
        // System.out.println("Physics Marks = " + marks[0]);//92
        // System.out.println("Math Marks = " + marks[1]);//95
        // System.out.println("Chem Marks = " + marks[2]);//97
        System.out.println("const_val  = " + const_val);//5-call by value

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] + " ");//call by reference
        }
        System.out.println();
    }

    public static void update(int marks[], int const_var){
        const_var=10;

        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
        System.out.println("const_val  = " + const_var);//10

    }
}
