#include<iostream>
using namespace std;
template<class T>
class num{
    private:
    T n;
    public:
    num(){}
    num(T x):n(x) {}
    T getnum(){
        return n;
    }
    T add(T x,T y){
    return (x+y);
}
};
int main()
{
    num<int>add1;
    num<int>numInt(7);
    num<double>numDouble(7.7);
    cout<<"int num="<<numInt.getnum()<<endl;

    int res1;
    res1=add1.add(2,3);
    cout<<res1<<endl;
}