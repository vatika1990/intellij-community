// "Add 'char' as 2nd parameter to method 'f'" "true"
class A {
    void f(int i,String s) {}
    public void foo() {
        <caret>f(1,'2',"");
    }
}