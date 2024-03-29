import 'package:flutter/material.dart';
import 'package:get/get_navigation/src/root/get_material_app.dart';
import 'package:ottugi_curry/config/config.dart';
import 'package:ottugi_curry/config/custom_theme_data.dart';

void main() async {
  // splash screen
  WidgetsFlutterBinding.ensureInitialized(); // 초기화 보장
  await Future.delayed(const Duration(seconds: 2)); // 3초 지연

  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return GetMaterialApp(
      title: '카레',
      theme: CustomThemeData.themeDataLight,
      initialRoute: '/login',
      getPages: Config.routers,
      // home: LoginPage(),
    );
  }
}