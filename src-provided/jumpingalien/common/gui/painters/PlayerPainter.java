package jumpingalien.common.gui.painters;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;

import jumpingalien.common.gui.AlienGUIUtils;
import jumpingalien.common.gui.AlienGameScreen;
import jumpingalien.common.sprites.ImageSprite;

public class PlayerPainter extends AbstractAlienPainter<AlienGameScreen<?, ?>> {

	private static final Color SIZE_BORDER = Color.RED;
	private static final Color LOCATION_COLOR = Color.RED;
	private static final Color SIZE_FILL = new Color(0x8800ff00, true);

	public PlayerPainter(AlienGameScreen<?, ?> screen) {
		super(screen);
	}

	@Override
	public void paintInWorld(Graphics2D g) {
		getGame()
				.getAlienInfoProvider()
				.getAlienXY()
				.ifPresent(
						xy -> {

							if (getOptions().getDebugShowAlienLocationAndSize()) {
								getGame()
										.getAlienInfoProvider()
										.getAlienSize()
										.ifPresent(
												size -> paintLocationAndSize(g,
														xy, size));
							}

							getGame()
									.getAlienInfoProvider()
									.getPlayerSprite()
									.ifPresent(
											sprite -> AlienGUIUtils
													.drawImageInWorld(
															g,
															((ImageSprite) sprite)
																	.getImage(),
															xy[0], xy[1], false));
						});
	}

	protected void paintLocationAndSize(Graphics2D g, int[] xy, int[] size) {
		g.setColor(SIZE_FILL);
		g.fillRect(xy[0], xy[1], size[0], size[1]);

		g.setColor(SIZE_BORDER);

		Stroke oldStroke = g.getStroke();
		if (getOptions().getDebugShowPixels()) {
			// use a smaller stroke if individual pixels are painted
			g.setStroke(new BasicStroke(0.5f));
		}
		g.drawRect(xy[0], xy[1], size[0], size[1]);
		g.setStroke(oldStroke);

		g.setColor(LOCATION_COLOR);
		if (getOptions().getDebugShowPixels()) {
			// only fill 1 pixel if individual pixels are painted
			g.fillRect(xy[0], xy[1], 1, 1);
		} else {
			g.fillRect(xy[0], xy[1], 5, 5);
		}
	}

}
