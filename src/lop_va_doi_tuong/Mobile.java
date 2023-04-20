package lop_va_doi_tuong;

public class maingo {
        public int battery;
        public String typing;
        public String[] inbox;
        public int count_inbox;
        public String[] list_msg_sent;
        public int count_list_msg_sent;
        public boolean isOn;
        public maingo() {
            inbox = new String[1000];
            list_msg_sent = new String[1000];
            battery = 65;
            isOn = true;
            count_inbox = 0;
            count_list_msg_sent = 0;
        }
        public boolean isOn() {return this.isOn; }
        public void turnOn() { this.isOn = true; }
        public void turnOff() { this.isOn = false; }
        public void charging() { this.battery = 100; }
        public void typing(String msg) {
            if(this.isOn) {
                this.typing = msg;
                battery--;
            } else {
                System.out.println("Điện thoại hết pin");
            }
        }
        public void send(maingo receiver) {
            if (this.isOn) {
                if (count_list_msg_sent > 1000) {
                    System.out.println("Bộ nhớ đầy");
                } else {
                    if (!typing.equals("")) {
                        this.list_msg_sent[count_list_msg_sent++] = this.typing;
                        receiver.receive(this.typing);
                        this.typing = "";
                        battery--;
                    }
                }
            } else {
                System.out.println("Điện thoại hết pin");
            }
        }
        public void receive(String msg) {
            if(this.isOn) {
                this.inbox[count_inbox++] = msg;
                battery--;
            } else {
                System.out.println("Điện thoại hết pin");
            }
        }
        public void displaySent() {
            System.out.println("====Sent====");
            for (int i = 0; i< this.count_list_msg_sent; i++) {
                System.out.println(list_msg_sent[i]);
            }
        }
        public void displayInbox() {
            System.out.println("====Inbox====");
            for (int i = 0; i < this.count_inbox; i++) {
                System.out.println(inbox[i]);
            }
        }
        public void displayInfo() {
            System.out.println("% Pin: " + this.battery + "%");
            System.out.println("Bật: " + isOn);
            System.out.println("Bộ nhớ tin nhắn đến: " + count_inbox + "/1000");
            System.out.println("Bộ nhớ tin nhắn đã gửi: " + count_list_msg_sent + "/1000");
        }

    }


