/**
 * 
 */
package csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author hemanth
 *
 */
public class StudentMarks {

	int id;
	String name;

	public void readFile() throws IOException {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Double> avglist = new ArrayList<>();
		ArrayList<Double> perlist = new ArrayList<>();
		ArrayList<Integer> idlist = new ArrayList<>();
		ArrayList<String> firstnamelist = new ArrayList<>();
		ArrayList<String> lastnamelist = new ArrayList<>();
		String file = "/home/hemanth/Downloads/students.csv";
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = "";
		br.readLine();
		while ((line = br.readLine()) != null) {
			String[] studentsdetails = line.split(",");
			if (studentsdetails.length > 0) {
				int subjectscount = studentsdetails.length - 3;
				idlist.add(Integer.parseInt(studentsdetails[0]));
				firstnamelist.add(studentsdetails[1]);
				lastnamelist.add(studentsdetails[2]);
				list.add(Integer.parseInt(studentsdetails[3]));
				list.add(Integer.parseInt(studentsdetails[4]));
				list.add(Integer.parseInt(studentsdetails[5]));
				list.add(Integer.parseInt(studentsdetails[6]));
				list.add(Integer.parseInt(studentsdetails[7]));
				list.add(Integer.parseInt(studentsdetails[8]));
				double avg = average(subjectscount, list);
				avglist.add(avg);
				double percen = percentage(subjectscount, list);
				perlist.add(percen);

			}
		}
		br.close();
		writefile(idlist, firstnamelist, lastnamelist, list, avglist, perlist, file);
	}

	private void writefile(ArrayList<Integer> idlist, ArrayList<String> firstnamelist, ArrayList<String> lastnamelist,
			ArrayList<Integer> list, ArrayList<Double> avglist, ArrayList<Double> perlist, String file)
			throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter(file);
		String n = "id";
		String n1 = "name";
		String n2 = "firstname";
		String n3 = "lastname";
		String n4 = "telugu";
		String n5 = "hindi";
		String n6 = "english";
		String n7 = "maths";
		String n8 = "science";
		String n9 = "social";
		fw.write(n);
		fw.write(',');
		fw.write(n1);
		fw.write(',');
		fw.write(n2);
		fw.write(',');
		fw.write(n3);
		fw.write(',');
		fw.write(n4);
		fw.write(',');
		fw.write(n5);
		fw.write(',');
		fw.write(n6);
		fw.write(',');
		fw.write(n7);
		fw.write(',');
		fw.write(n8);
		fw.write(',');
		fw.write(n9);
		fw.write(',');
		String name1 = "Average";
		String name2 = "Percentage";
		fw.write(name1);
		fw.write(',');
		fw.write(name2);
		fw.write('\n');
		for (int i = 0; i < idlist.size(); i++) {
			fw.write('\n');
			fw.write(String.valueOf(idlist.get(i)));
			fw.write(',');
			fw.write(String.valueOf(firstnamelist.get(i)));
			fw.write(',');
			fw.write(String.valueOf(lastnamelist.get(i)));
			fw.write(',');
			fw.write(String.valueOf(list.get(i)));
			fw.write(',');
			fw.write(String.valueOf(avglist.get(i)));
			fw.write(',');
			fw.write(String.valueOf(perlist.get(i)));
		}
		fw.flush();
		fw.close();

	}

	private double percentage(int subjectscount, ArrayList<Integer> list) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum / 360 * 100;
	}

	public double average(int subjectscount, ArrayList<Integer> list) {

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}

		double avg = sum / subjectscount;
		return avg;
	}

	public void display() throws IOException {
		String file = "/home/hemanth/Downloads/students.csv";
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = "";
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}

}
