# swing-buttons-and-actionlisteners
A first look at basic UI elements from the Swing libraries and how to hook them up using ActionListeners.

This repo will have three main versions (well, that's all that's planned so far):

- Implementing an Action Listener using the syntax that _some_ IDEs will automatically generate for you.
- Creating a subclass of JLabel that implements the ActionListener interface.
- Creating a subclass of JComponent that implements the ActionListener interface and owns a JLabel (this is an example of choosing _composition_ over _inheritance_).

While develoeprs will debate over the benefits of composition over inheritance (the second two examples), I would suggest that wither of these is more suitable for you just now than the first approach. 

You might wonder why I start with the first approach at all, but it's so common in Java examples and tutorials that you should at least be familiar with it. The reason it's so prevalent is that it is the default code that is generated by a lot of the Java IDEs when you ask them to create a listener for you. I can understand (though I don't really agree with) the reasons why, however I think that the second and third approaches both give you a better understanding of the basic structures that OOP is based on. 

This post is quite a good example of the issues with the first approach: https://stackoverflow.com/questions/10311014/understanding-actionlistener
