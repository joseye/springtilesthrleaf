f=open('layout_horizontal.html')
lines=f.readlines();
f2=open('layout_horizontal.htmlx','w')
f3=open('loginx','w')
i=0;
for li in lines:
    ss=li.split('\r');
    for x in ss:
        f3.write( 'abc%sdef%i \r\n'%(x,i));
        i=i+1;
        if x and x.replace("\r\n","").strip()!='' :
            f2.write(x);
            f2.write('\r');
        else:
            print 'li is empty'
f2.close();
f.close();
f3.close();
