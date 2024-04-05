package main;

import java.util.EventListener;

public interface NativeKeyBoardListener extends EventListener {
	
    public void keyPressed(NativeKeyEvent nativeKeyEvent);

    public void keyTyped(NativeKeyEvent nativeKeyEvent);
    
    public void keyReleased(NativeKeyEvent nativeKeyEvent);
    
}
