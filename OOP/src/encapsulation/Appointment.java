package encapsulation;
import java.time.LocalDateTime;
public class Appointment {
   private int id;
   private int patientId;
   private int doctorId;
   private LocalDateTime appointmentDate;
   private String purpose;
   private String status;

    public Appointment(int id, int patientId, int doctorId, LocalDateTime appointmentDate, String purpose, String status) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.purpose = purpose;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getPurose() {
        return purpose;
    }

    public void setPurose(String purpose) {
        this.purpose = purpose;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public String displayAppointmentInfo(){
        return String.format (
                "============= Doctor Information ==============\n" +
                "Appointment ID:        %d%n" +
                "Patient ID:            %d%n" +
                "Doctor ID:             %d%n" +
                "Appointment Date:      %s%n" +
                "Purpose:               %s%n" +
                "Status:                %s%n" +
                "=================================================",
                getId(), getPatientId(), getDoctorId(), getAppointmentDate(),
                getPurose(), getStatus()
        );
    }

}
