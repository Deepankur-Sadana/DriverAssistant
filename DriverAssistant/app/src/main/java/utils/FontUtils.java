package utils;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by Neelanjana on 6/21/15.
 */
public class FontUtils {

	public static Typeface robotoLight, robotoMedium, robotoRegular,
			robotoBold, robotoLightItalic, robotoCondensedRegular,
			robotoCondensedBold;
	protected static final int FADE_IN_TIME = 200;

	public enum Fonts {
		ROBOTO_LIGHT, ROBOTO_REGULAR, ROBOTO_BOLD, ROBOTO_MEDIUM, ROBOTO_LIGHT_ITALIC, ROBOTO_CONDENSED_REGULAR, ROBOTO_CONDENSED_BOLD
	}

	public static Typeface getTypeface(Fonts fontType, Context context) {

		switch (fontType) {
			case ROBOTO_LIGHT:
				if (robotoLight == null)
					robotoLight = Typeface.createFromAsset(context.getAssets(),
							"fonts/Roboto-Light.ttf");
				return robotoLight;

			case ROBOTO_MEDIUM:
				if (robotoMedium == null)
					robotoMedium = Typeface.createFromAsset(context.getAssets(),
							"fonts/Roboto-Medium.ttf");
				return robotoMedium;

			case ROBOTO_REGULAR:
				if (robotoRegular == null)
					robotoRegular = Typeface.createFromAsset(context.getAssets(),
							"fonts/Roboto-Regular.ttf");
				return robotoRegular;

			case ROBOTO_BOLD:
				if (robotoBold == null)
					robotoBold = Typeface.createFromAsset(context.getAssets(),
							"fonts/Roboto-Bold.ttf");
				return robotoBold;

			case ROBOTO_LIGHT_ITALIC:
				if (robotoLightItalic == null)
					robotoLightItalic = Typeface.createFromAsset(
							context.getAssets(), "fonts/Roboto-LightItalic.ttf");
				return robotoLightItalic;

			case ROBOTO_CONDENSED_REGULAR:
				if (robotoCondensedRegular == null)
					robotoCondensedRegular = Typeface.createFromAsset(
							context.getAssets(),
							"fonts/RobotoCondensed-Regular.ttf");
				return robotoCondensedRegular;

			case ROBOTO_CONDENSED_BOLD:
				if (robotoCondensedBold == null)
					robotoCondensedBold = Typeface.createFromAsset(
							context.getAssets(), "fonts/RobotoCondensed-Bold.ttf");
				return robotoCondensedBold;

		}
		return null;
	}
}
