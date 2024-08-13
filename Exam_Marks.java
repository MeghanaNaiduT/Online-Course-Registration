//package exampack;
import java.io.*;

class Exam_Marks
{
	int total_marks1;
	int total_marks2;
	int total_marks3;
	int total;
	final String FILE_NAME = "data.txt";
	Exam_Marks()
	{}
	
	/*public int totmark(int p1)
	{
		int total1=calculateTotalMarks(p1);
		return total1;
	}*/
	public Exam_Marks(int mark1,int s,int p1)
	{
		
		
		if(s==1)
		{
			modifyDataFile(1,mark1,p1);
                        modifyDataFile(p1);
		//this.total_marks1=mark1;
		}
		if(s==2)
		{
			modifyDataFile(2,mark1,p1);
                        modifyDataFile(p1);
		//this.total_marks2=mark1;
		}
		if(s==3)
		{
			modifyDataFile(3,mark1,p1);
                        modifyDataFile(p1);
		//this.total_marks3=mark1;
		}
		//this.total=calculateTotalMarks(p1);
		//this.total=this.total_marks1+this.total_marks2+this.total_marks3;
		//int tot=this.total;
		//return tot;
	}
	
	
	public void addStudentMarks(int no, String examName, int marks)
	{int x=no;
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME, true))) 
		{
            writer.println();
            writer.println("{no2=" + x);
            writer.println(examName + "=" + marks);
            writer.println("}");
            System.out.println("New data appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
	}
	/*public int calculateTotalMarks(int no)
	{int totalMarks = 0;
	int x=no;
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            
            int k = 0;
            while ((line = reader.readLine()) != null) {
                if (line.trim().equals("no2=" + x)) {
                    k++;
                } if (line.startsWith("Exam")) {
                    totalMarks += Integer.parseInt(line.split("=")[1].trim());
                }
                if (k == 3) {
                    break;
                }
            }
            
            PrintWriter pw = new PrintWriter(new FileWriter(FILE_NAME, true));
            pw.println();
            pw.println("{no2=" + x);
            pw.println("totalMarks=" + totalMarks+"}");
			pw.close();
			System.out.println("Total marks calculated and appended successfully.");
			return totalMarks;
            

            
        } 
		catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.");
            e.printStackTrace();
        }
		return totalMarks;
    }*/
	

public static void modifyDataFile(int examno, int marks, int pos) {
    try {
        String filename = "data.txt";
        File inputFile = new File(filename);
        File tempFile = new File("temp.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        String currentLine;
        boolean no2Found = false;
        boolean examFound = false;
        while ((currentLine = reader.readLine()) != null) {
            if (currentLine.startsWith("{no2=" + pos)) {
                no2Found = true;
            }

            if (no2Found) {
                if (examno == 1) {
                    if (currentLine.startsWith("exam1marks=")) {
                        writer.write("exam1marks=" + marks);
                        writer.newLine();
                        examFound = true;
                    } else if (currentLine.startsWith("exam2marks=") || currentLine.startsWith("exam3marks=")) {
                        writer.write(currentLine);
                        writer.newLine();
                    } else if (currentLine.startsWith("totalmarks=")) {
                        int k = Integer.parseInt(currentLine.substring(currentLine.indexOf('=') + 1));
                        if (!examFound) {
                            k += marks;
                            examFound = true;
                        }
                        writer.write("totalmarks=" + k);
                        writer.newLine();
                    } else {
                        writer.write(currentLine);
                        writer.newLine();
                    }
                } else if (examno == 2) {
                    if (currentLine.startsWith("exam2marks=")) {
                        writer.write("exam2marks=" + marks);
                        writer.newLine();
                        examFound = true;
                    } else if (currentLine.startsWith("exam1marks=") || currentLine.startsWith("exam3marks=")) {
                        writer.write(currentLine);
                        writer.newLine();
                    } else if (currentLine.startsWith("totalmarks=")) {
                        int k = Integer.parseInt(currentLine.substring(currentLine.indexOf('=') + 1));
                        if (!examFound) {
                            k += marks;
                            examFound = true;
                        }
                        writer.write("totalmarks=" + k);
                        writer.newLine();
                    } else {
                        writer.write(currentLine);
                        writer.newLine();
                    }
                } else if (examno == 3) {
                    if (currentLine.startsWith("exam3marks=")) {
                        writer.write("exam3marks=" + marks);
                        writer.newLine();
                        examFound = true;
                    } else if (currentLine.startsWith("exam1marks=") || currentLine.startsWith("exam2marks=")) {
                        writer.write(currentLine);
                        writer.newLine();
                    } else if (currentLine.startsWith("totalmarks=")) {
                        int k = Integer.parseInt(currentLine.substring(currentLine.indexOf('=') + 1));
                        if (!examFound) {
                            k += marks;
                            examFound = true;
                        }
                        writer.write("totalmarks=" + k);
                        writer.newLine();
                    } else {
                        writer.write(currentLine);
                        writer.newLine();
                    }
                } else {
                    writer.write(currentLine);
                    writer.newLine();
                }

                if (currentLine.contains("}")) {
                    no2Found = false;
                    examFound = false;
                }
            } else {
                writer.write(currentLine);
                writer.newLine();
            }
        }

        reader.close();
        writer.close();

        inputFile.delete();
        tempFile.renameTo(inputFile);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
public static void modifyDataFile(int pos) {
        try {
            String filename = "data.txt";
            File inputFile = new File(filename);
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String currentLine;
            boolean no2Found = false;
            int totalMarks = 0;

            while ((currentLine = reader.readLine()) != null) {
                if (currentLine.startsWith("{no2=" + pos)) {
                    no2Found = true;
                }

                if (no2Found) {
                    if (currentLine.startsWith("exam")) {
                        int examMarks = Integer.parseInt(currentLine.split("=")[1].trim());
                        totalMarks += examMarks;
                    }

                    if (currentLine.startsWith("totalmarks=")) {
                        writer.write("totalmarks=" + totalMarks);
                        writer.newLine();
                    } else {
                        writer.write(currentLine);
                        writer.newLine();
                    }

                    if (currentLine.contains("}")) {
                        no2Found = false;
                    }
                } else {
                    writer.write(currentLine);
                    writer.newLine();
                }
            }

            reader.close();
            writer.close();

            inputFile.delete();
            tempFile.renameTo(inputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
	