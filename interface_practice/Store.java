package interface_practice;

/**
 * Store
 */
public class Store {
  Member members[] = new Member[10];

  void register(Member m) {
    for (int i = 0; i < members.length; i++) {
      if (members[i] == null) {
        members[i] = m;
        break;
      }
    }
  }

  void inviteSale() {
    for (int i = 0; i < members.length; i++) {
      members[i].callback();
    }
  }
}
