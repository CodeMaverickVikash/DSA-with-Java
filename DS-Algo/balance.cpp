class Solution
{
   public:
   //Function to check if brackets are balanced or not.
   bool ispar(string x)
   {
       // Your code here
       stack<char> s;
       // 
       unordered_map<char,char> m; // duplicate element allow
       m['(']=')';
       m['{']='}';
       m['[']=']';
       //cout<<s.top()<<endl;
       if(x.length()<=1){
           return false;
       }
       
       s.push(x[0]);
       
       for(int i=1;i<x.length();i++){
           
           if(!s.empty()){
               if(x[i]!=m[s.top()]){
                  s.push(x[i]);
               }
               else{
                   s.pop();
               }
           }
           else{
               s.push(x[i]);
               
           }
           
           
       }
       
       
       if(s.empty()){
           return true;
       }
       else{
           return false;
       }
       
       //return 0;
   }

};