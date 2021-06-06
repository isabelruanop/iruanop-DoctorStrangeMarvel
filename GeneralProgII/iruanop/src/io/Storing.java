package io;

import data.DataStore;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Isabel Ruano <i.ruano1@usp.ceu.es>
 */
public class Storing {

    public static void checkArchivo() throws IOException {

        File file = new File("DoctorStrangeHotel.dat");

        if (!file.exists()) {

            file.createNewFile();
            System.out.println("\nEste archivo no existe\n");

        } else {

            System.out.println("\nArchivo encontrado con éxito\n");

        }

    }

    public static DataStore cargarPartida() {

        File file = new File("/Users/isabelruanop/Desktop");
        DataStore dat = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {

            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);

            dat = (DataStore) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException ex) {

            dat = new DataStore();

        } finally {

            if (objectInputStream != null) {

                try {

                    objectInputStream.close();

                } catch (IOException ex) {

                    System.out.println("Error");
                    ex.printStackTrace();

                }
            }

            if (fileInputStream != null) {

                try {

                    fileInputStream.close();

                } catch (IOException ex) {

                    System.out.println("Error");
                    ex.printStackTrace();

                }
            }
        }

        return dat;

    }

    public static void guardarPartida(DataStore data) {

        File file = new File("DoctorStrangeHotel.dat");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        try {

            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject((DataStore) data);

        } catch (IOException ex) {

            System.out.println("Error");
            ex.printStackTrace();

        } finally {

            if (objectOutputStream != null) {

                try {

                    objectOutputStream.close();

                } catch (IOException ex) {

                    System.out.println("Error");
                    ex.printStackTrace();

                }
            }

            if (fileOutputStream != null) {

                try {

                    fileOutputStream.close();

                } catch (IOException ex) {

                    System.out.println("Error");
                    ex.printStackTrace();

                }
            }
        }
    }
}
