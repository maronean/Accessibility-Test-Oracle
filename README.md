# Accessibility-Test-Oracle
Each Android application represents a particular mobile software accessibility defect. 

This test oracle is intended to be used to aid in the development and validation of future accessibiltiy testing tools.


#Accessibility Defects included
1. Incompatible	Text	fields:	contain	readable	content		descriptions	for	
accessibility	tools.
2. Clickable	spans	used	as	buttons:	Should	not	be	used	in	place	of	buttons	
because	they	are	less	readable	to	screen	readers.
3. Duplicate	Clickable	objects:	Duplicate	touch	targets	will	confuse	the	layout	for	
accessibility	tools.
4. Redundant	content	descriptions:	Ensure	that	contend	description	does	not	
contain	confusing	or	generic	language	(i.e.	A	button	with	the	description	
button)
5. Missing	Speak-able	Text:	Check	to	make	sure	that	each	view	has	some	content	
that	can	be	read	by	accessibility	services	like	‘TalkBack’
6. Touch	target	too	small:	Ensure	that	all	touch	targets	meet	minimum	size	
requirements.
