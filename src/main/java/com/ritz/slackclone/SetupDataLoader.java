// package com.ritz.slackclone;

// import java.time.LocalDateTime;
// import java.util.Arrays;
// import java.util.Collection;
// import java.util.List;

// import javax.transaction.Transactional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.ApplicationListener;
// import org.springframework.context.event.ContextRefreshedEvent;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.stereotype.Component;

// import com.ritz.slackclone.entity.Privilege;
// import com.ritz.slackclone.entity.Role;
// import com.ritz.slackclone.entity.User;
// import com.ritz.slackclone.repository.PrivilegeRepository;
// import com.ritz.slackclone.repository.RoleRepository;
// import com.ritz.slackclone.repository.UserRepository;

// @Component
// public class SetupDataLoader implements
//   ApplicationListener<ContextRefreshedEvent> {

//     boolean alreadySetup = false;

//     @Autowired
//     private UserRepository userRepository;
 
//     @Autowired
//     private RoleRepository roleRepository;
 
//     @Autowired
//     private PrivilegeRepository privilegeRepository;
 
//     @Autowired
//     private PasswordEncoder passwordEncoder;
 
//     @Override
//     @Transactional
//     public void onApplicationEvent(ContextRefreshedEvent event) {
 
//         if (alreadySetup)
//             return;
//         Privilege readPrivilege
//           = createPrivilegeIfNotFound("READ_PRIVILEGE");
//         Privilege writePrivilege
//           = createPrivilegeIfNotFound("WRITE_PRIVILEGE");
 
//         List<Privilege> adminPrivileges = Arrays.asList(
//           readPrivilege, writePrivilege);
//         createRoleIfNotFound("ROLE_ADMIN", adminPrivileges);
//         createRoleIfNotFound("ROLE_USER", Arrays.asList(readPrivilege));

//         Role adminRole = roleRepository.findByName("ROLE_ADMIN");
//         User user = new User();
//         user.setUsername("test");
//         user.setPassword(passwordEncoder.encode("test"));
//         user.setEmail("test@test.com");
//         user.setCreatedAt(LocalDateTime.now());
//         user.setRoles(Arrays.asList(adminRole));

//         userRepository.save(user);

//         alreadySetup = true;
//     }

//     @Transactional
//     Privilege createPrivilegeIfNotFound(String name) {
 
//         Privilege privilege = privilegeRepository.findByName(name);
//         System.out.println(privilege);
//         if (privilege == null) {
//             privilege = new Privilege(name);
//             privilegeRepository.save(privilege);
//         }
//         return privilege;
//     }

//     @Transactional
//     Role createRoleIfNotFound(
//       String name, Collection<Privilege> privileges) {
 
//         Role role = roleRepository.findByName(name);
//         if (role == null) {
//             role = new Role(name);
//             role.setPrivileges(privileges);
//             roleRepository.save(role);
//         }
//         return role;
//     }
// }