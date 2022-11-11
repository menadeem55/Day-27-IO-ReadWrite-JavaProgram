package com.readWrite;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.WatchService;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;

import static java.nio.file.StandardWatchEventKinds.*;

public class EmployeePayrollService {

	public void listFilesDirectory() throws IOException, InterruptedException {

		WatchService watchService = FileSystems.getDefault().newWatchService(); // Activate watch Service

		Path path = Paths.get("C:\\Users\\menad\\OneDrive\\Desktop\\WatchService\\"); // Convert location to file path

		// Register watch service on above path ==> Pass events to be watched
		// (Create/Delete/Modify)
		path.register(watchService, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);

		List<String> logs = new ArrayList<String>();

		boolean poll = true;
		while (poll) {

			WatchKey key = watchService.take(); // Reference / Pointer current file or folder watching

			for (WatchEvent<?> event : key.pollEvents()) { // Printing the events (Create / Modify / Delete)
				System.out.println("Event kind : " + event.kind() + " - File : " + event.context());

				logs.add("Event kind : " + event.kind() + " - File : " + event.context());
			}

			Files.write(Paths.get("C:\\Users\\menad\\OneDrive\\Desktop\\WatchService\\"), logs,
					StandardOpenOption.CREATE);

			poll = key.reset(); // Reseting the reference so that it can be used later
		}
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		EmployeePayrollService obj = new EmployeePayrollService();
		obj.listFilesDirectory();
	}

}
