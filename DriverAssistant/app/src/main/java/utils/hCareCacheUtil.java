package utils;

import android.content.Context;

import com.example.deepankur.newproject.hCareApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class hCareCacheUtil {

	private hCareCacheUtil() {
	}

	public static void writeToInternalStorage(Object obj, String objName) {
		checkCacheSize(hCareApplication.getInstance(), objName);
		try {
			FileOutputStream fos =
					hCareApplication.getInstance().openFileOutput(objName, Context.MODE_PRIVATE);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void removeFromInternalStorage(String objName) {
		try {
			File dir = hCareApplication.getInstance().getFilesDir();
			File file = new File(dir, objName);
			file.delete();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void checkCacheSize(Context _context, String objName) {
		try {
			File cacheDir = _context.getCacheDir();
			File filesDir = _context.getFilesDir();
			long cacheSize = getFolderSize(cacheDir);
			long filesSize = getFolderSize(filesDir);
			long usedSpace = cacheSize + filesSize;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static long getFolderSize(File directory) {
		long length = 0;
		for (File file : directory.listFiles()) {
			if (file.isFile()) {
				length += file.length();
			} else {
				length += getFolderSize(file);
			}
		}
		return length;
	}

	public static Object readFromInternalStorage(String objName) {
		Object object = null;
		try {
			File file = hCareApplication.getInstance().getFileStreamPath(objName);

			if (file.exists()) {
				FileInputStream fis = hCareApplication.getInstance().openFileInput(objName);
				ObjectInputStream ois = new ObjectInputStream(fis);
				object = ois.readObject();
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			e.printStackTrace();
		}
		return object;

	}
}
