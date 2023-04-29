import 'package:flutter/cupertino.dart';
import 'package:ottugi_curry/view/comm/default_layout_widget.dart';

class BookmarkPage extends StatelessWidget {
  const BookmarkPage({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return DefaultLayoutWidget(appBarTitle: '북마크 레시피',body: Text('BookmarkPage'));
  }
}
