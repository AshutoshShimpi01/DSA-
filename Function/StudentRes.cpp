//
//  main.cpp
//  stud result.cpp
//
//  Created by ♠️ᴅᴀᴅ's ɢɪғᴛ♠️ on 04/07/21.
//

#include<iostream>

using namespace std;

class Student
{
    private: int rollno,phy,che,maths;
    private: string name;
    
    private: static string college;
    public:  static int count;
    public:  static int pass;
    public:  static int fail;
    
    public: Student()  // constructor get called
    {
        count++;  // 3
        
    }
    public: void setData()
    {
        cout<<"\nEnter rollno and name of student: ";
        cin>>rollno>>name;
        
        cout<<"\nEnter marks of physics,chemistry and maths: ";
        cin>>phy>>che>>maths;
        
    }
    public:void showData()
    {
        cout<<"\n"<<rollno<<" "<<name;
        cout<<"\nMarks of subjects: "<<phy<<"  "<<che<<"  "<<maths;
    }
    public:void totalmark()
    {
        int tm=phy+che+maths;
        cout<<"\nTotal marks: "<<tm;

        if(phy>=40 && che>=40 && maths>=40)
        {
            pass++;  // static member
            
        }
        else
        {
            fail++;  // static member
        }
    }
    public:void percentage()
    {
        float per=(phy+che+maths)/3;
        cout<<"\nPercentage: "<<per;
    }
    
    
};
string Student::college="SITS";
int Student::count=0;
int Student::pass=0;
int Student::fail=0;

int main()
{
    Student s1;
    Student s2;
    Student s3;
    
    s1.setData();
    s1.showData();
    s1.totalmark();
    s1.percentage();
    
    cout<<"\n-----------------------------------------------------------------------\n";
    
    s2.setData();
    s2.showData();
    s2.totalmark();
    s2.percentage();
    
    cout<<"\n---------------------------------------------------------------------------\n";
    
    s3.setData();
    s3.showData();
    s3.totalmark();
    s3.percentage();
    
    
    cout<<"\nTotal student objects are: "<<Student::count;
    cout<<"\nTotal student pass are: "<<Student::pass;
    cout<<"\nTotal student fail are: "<<Student::fail;
    return 0;
    
    
    
}
