int countDistinctColorings(vector<string> domino)
{
    string s = domino.get(0);
    string t = domino.get(1);
    long n = s.length(),a=1,i,p=0,m=1e9+7;
    for(i=0;i<n;i++){
        if(s[i]!=t[i]){
            if(p==0){a=(a*6)%m;p=1;}
            else if(p==1){a=(a*3)%m;}
            else{a=(a*2)%m;p=1;}
            i++;
        }else{
            if(p==0){a=(a*3)%m;p=2;}
            else if(p==1){p=2;}
            else{a=(a*2)%m;}      
        }
    }
    return a;
}