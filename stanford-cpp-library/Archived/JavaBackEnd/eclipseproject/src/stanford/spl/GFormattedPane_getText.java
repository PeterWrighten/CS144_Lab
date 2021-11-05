package stanford.spl;

import acm.graphics.GObject;
import acm.util.TokenScanner;

public class GFormattedPane_getText extends JBESwingCommand {
	public void execute(TokenScanner scanner, JavaBackEnd jbe) {
		scanner.verifyToken("(");
		String id = nextString(scanner);
		scanner.verifyToken(")");
		
		GObject gobj = jbe.getGObject(id);
		if (gobj != null && gobj instanceof GFormattedPane) {
			GFormattedPane pane = (GFormattedPane) gobj;
			String text = pane.getText();
			SplPipeDecoder.encodeAndWrite(text);
		} else {
			SplPipeDecoder.writeError("Not a formatted pane: " + id);
		}
	}
}