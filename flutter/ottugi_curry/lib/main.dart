import 'package:flutter/material.dart';
import 'package:flutter_dotenv/flutter_dotenv.dart';
import 'package:get/get_navigation/src/root/get_material_app.dart';
import 'package:kakao_flutter_sdk_user/kakao_flutter_sdk_user.dart';
import 'package:ottugi_curry/config/config.dart';
import 'package:ottugi_curry/config/custom_theme_data.dart';
import 'package:firebase_core/firebase_core.dart';
import 'package:ottugi_curry/view/page/recipe_camera/result_check_page.dart';
import 'firebase_options.dart';

void main() async {
  // firebase
  WidgetsFlutterBinding.ensureInitialized();
  await Firebase.initializeApp(
    options: DefaultFirebaseOptions.currentPlatform,
  );

  // splash screen
  WidgetsFlutterBinding.ensureInitialized(); // 초기화 보장
  await Future.delayed(const Duration(seconds: 2)); // 지연

  // kakao Flutter SDK
  KakaoSdk.init(nativeAppKey: 'f058e8e5bc00f59848d0eb05b04aa3b6');
  await userStorage.ready;

  // ChatGpt API Key
  await dotenv.load(fileName: "assets/config/.env");

  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return GetMaterialApp(
      title: '카레',
      theme: CustomThemeData.themeDataLight,
      //initialRoute: '/main', // login
      getPages: Config.routers,
      home: const ResultCheck(
        imagePath: 'assets/images/ingredients.png',
      ),
    );
  }
}
