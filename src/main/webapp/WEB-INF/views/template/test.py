import re
f=open('layout_horizontal.htmlx')
f2=open('layout_horizontal.htmlxx','w')
lines=f.readlines()
p=re.compile(r'href="([\w+\./]+)"')
for line in lines:
	#print line;
	m=p.search(line);
	if m:
		y=m.group(0)
		x=m.group(1).replace('../../','/')
		x='%s @{%s}'%(y,x)
	#	print x
		li2=line.replace(y,x)
		f2.write(li2);
f.close();
f2.close();