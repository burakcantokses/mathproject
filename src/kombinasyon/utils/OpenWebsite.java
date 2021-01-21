package kombinasyon.utils;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author burak
 *
 * @time 15.Oca.2021 17:18:08
 */
public class OpenWebsite {

	public static void openLink(String url) {
		Desktop d = Desktop.getDesktop();
		try {
		    d.browse(new URI(url));
		} catch (IOException | URISyntaxException e2) {
		    e2.printStackTrace();
		} 
	}
}

