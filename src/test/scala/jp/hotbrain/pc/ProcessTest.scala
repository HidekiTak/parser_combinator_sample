package jp.hotbrain.pc

import org.junit.Test

class ProcessTest {

  private[this] final val ins1 =
    """このメールはサンケイリビング新聞社のメール会員のみなさまへお送りしています
●○━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
【リビングWebメール　むさしの版】
>>>　リビングむさしのWeb http://mrs.living.jp/musashino/   　 2017.06.23
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━○●

こんにちは ~ name ~ 様！
「リビングWebメール」むさしの版編集部です。
リビングむさしの主催、主婦が主役のイベント「主婦の文化祭」を開催します！
多彩な54の手作り作家たちの「アート＆ライフマーケット」と
ミセス世代が活躍するライブステージの3本立て！ぜひ遊びに来てください！

■主婦のための文化祭を開催！手作りマーケットも実施
海の日7/17（月・祝）は 吉祥寺第一ホテルへ Let's GO!!
http://mag2.living.jp/c/alnhab1ejQs1zkab

--PR-------------------------------------------------------------------
★☆★☆参加者には北海道銘菓「白い恋人」をプレゼント★☆★☆
7/9（日）参加無料「女性税理士が教える家と相続セミナー」
吉祥寺東急REIホテルで開催。ホテルのコーヒーまたは紅茶付き！
不動産を使って最大限に相続税を下げる方法を教えます。申し込みは電話を。
サンケイリビング武蔵野本部＝0422-21-2531（9:30～18:00、土・日・祝除く）
------------------------------------------------------------------PR---

━━━━━━━━━━━━━━━━━
【今週のダイジェスト】注目はココ！
━━━━━━━━━━━━━━━━━
■食べるべき！中央線の美味しいカレー店
地域特派員が「おいしかった」と絶賛した12店をドドーンと紹介！
http://mag2.living.jp/c/alnhab1ejQs1zkac

■試食・試飲あり！武蔵野のおみやげ候補が集合
「第4回むさしのプレミアム市民審査会」審査員募集！
http://mag2.living.jp/c/alnhab1ejQs1zkad

■2020年に向けて武蔵野市の素敵なところを広報しませんか？
武蔵野市魅力発掘サポーター募集中！
http://mag2.living.jp/c/alnhab1ejQs1zkae

■キッチン・耐震・バリアフリー…
何でも聞ける！LIVING幸せリフォーム無料相談会★7/22（土）参加者募集開始
http://mag2.living.jp/c/alnhab1ejQs1zkaf

♪━━━━━━━━━
地元のイベント情報
━━━━━━━━━♪
【三鷹】7/9（日）まで「堀尾貞治展 あたりまえのこと 音の形」＠ギャラリー由芽
http://mag2.living.jp/c/alnhab1ejQs1zkag

【堀ノ内】7/2（日）第9回妙法寺夏のふれあい祭り
http://mag2.living.jp/c/alnhab1ejQs1zkah

【武蔵境】夏の収穫祭！7/1（土）は農業ふれあい公園の夏まつりへ
http://mag2.living.jp/c/alnhab1ejQs1zkai

【西荻窪】7/17（月・祝）まで「自然を編む」三人展＠西荻窪
http://mag2.living.jp/c/alnhab1ejQs1zkaj

━━━━━━━━━━━━━━━━━━━━━━━━
☆大人気！地域特派員＆ブロガー記事ピックアップ☆
━━━━━━━━━━━━━━━━━━━━━━━━
【西荻窪】レトロ系キャラのかわいい雑貨と女子文具なら「Me'sica（ミーシカ）」へ
http://mag2.living.jp/c/alnhab1ejQs1zkak

【吉祥寺】駅近穴場カフェでサラダ・スープ・ドリンク付き1000円の充実ランチプレート
http://mag2.living.jp/c/alnhab1ejQs1zkal

━━━━━━━━━━━━━━━━━
コチラチェック！連載コラム＆ブログ
━━━━━━━━━━━━━━━━━
地元のブロガーが紹介する街のグルメ速報をチェック！
【満腹の扉】
http://mag2.living.jp/c/alnhab1ejQs1zkam

「リビングむさしの」のスタッフが更新中！
【こちら編集室！】
http://mag2.living.jp/c/alnhab1ejQs1zkan


━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
◆会員情報の変更について
　登録情報の確認・変更・メールマガジンの解除は、ログイン後、
　ページ右上の「登録情報」→「メール受信」から行えます
　本メルマガの配信解除をするには「リビング地域Web」の登録解除をしてください
    http://mag2.living.jp/c/alnhab1ejQs1zkao
◆パスワードを忘れた場合
    https://com.living.jp/user/pwrem
◆サンケイリビング新聞社の個人情報保護の取り組みについて
    http://www.sankeiliving.co.jp/profile/privacy.html

＊こちらに掲載された記事全文／一部を許可なく転載することを禁じます。
　発行：サンケイリビング新聞社    http://www.sankeiliving.co.jp/
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
""".stripMargin

  private[this] final val ins11 =
    """このメールはサンケイリビング新聞社のメール会員のみなさまへお送りしています
●○━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
【リビングWebメール　むさしの版】
>>>　リビングむさしのWeb http://mrs.living.jp/musashino/   　 2017.06.23
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━○●

こんにちは ~ name ~ 様！
「リビングWebメール」むさしの版編集部です。
リビングむさしの主催、主婦が主役のイベント「主婦の文化祭」を開催します！
多彩な54の手作り作家たちの「アート＆ライフマーケット」と
ミセス世代が活躍するライブステージの3本立て！ぜひ遊びに来てください！

■主婦のための文化祭を開催！手作りマーケットも実施
海の日7/17（月・祝）は 吉祥寺第一ホテルへ Let's GO!!
http://mag2.living.jp/c/alnhab1ejQs1zkab

--PR-------------------------------------------------------------------
★☆★☆参加者には北海道銘菓「白い恋人」をプレゼント★☆★☆
7/9（日）参加無料「女性税理士が教える家と相続セミナー」
吉祥寺東急REIホテルで開催。ホテルのコーヒーまたは紅茶付き！
不動産を使って最大限に相続税を下げる方法を教えます。申し込みは電話を。
サンケイリビング武蔵野本部＝0422-21-2531（9:30～18:00、土・日・祝除く）
------------------------------------------------------------------PR---

━━━━━━━━━━━━━━━━━
【今週のダイジェスト】注目はココ！
━━━━━━━━━━━━━━━━━
~ digest_01 ~

~ digest_02 ~

~ digest_03 ~

~ digest_04 ~

♪━━━━━━━━━
地元のイベント情報
━━━━━━━━━♪
~ event_01 ~

~ event_02 ~

~ event_03 ~

~ event_04 ~

━━━━━━━━━━━━━━━━━━━━━━━━
☆大人気！地域特派員＆ブロガー記事ピックアップ☆
━━━━━━━━━━━━━━━━━━━━━━━━
~ pickup_01 ~

~ pickup_02 ~
━━━━━━━━━━━━━━━━━
コチラチェック！連載コラム＆ブログ
━━━━━━━━━━━━━━━━━
~ blog_01 ~

~ blog_02 ~

━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
◆会員情報の変更について
　登録情報の確認・変更・メールマガジンの解除は、ログイン後、
　ページ右上の「登録情報」→「メール受信」から行えます
　本メルマガの配信解除をするには「リビング地域Web」の登録解除をしてください
    http://mag2.living.jp/c/alnhab1ejQs1zkao
◆パスワードを忘れた場合
    https://com.living.jp/user/pwrem
◆サンケイリビング新聞社の個人情報保護の取り組みについて
    http://www.sankeiliving.co.jp/profile/privacy.html

＊こちらに掲載された記事全文／一部を許可なく転載することを禁じます。
　発行：サンケイリビング新聞社    http://www.sankeiliving.co.jp/
━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
"""
  private[this] final val insMap = Map(
    "~ digest_01 ~" ->
      """■食べるべき！中央線の美味しいカレー店
地域特派員が「おいしかった」と絶賛した12店をドドーンと紹介！
http://mag2.living.jp/c/alnhab1ejQs1zkac""",

    "~ digest_02 ~" ->
      """■試食・試飲あり！武蔵野のおみやげ候補が集合
「第4回むさしのプレミアム市民審査会」審査員募集！
http://mag2.living.jp/c/alnhab1ejQs1zkad""",

    "~ digest_03 ~" ->
      """■2020年に向けて武蔵野市の素敵なところを広報しませんか？
武蔵野市魅力発掘サポーター募集中！
http://mag2.living.jp/c/alnhab1ejQs1zkae""",

    "~ digest_04 ~" ->
      """■キッチン・耐震・バリアフリー…
何でも聞ける！LIVING幸せリフォーム無料相談会★7/22（土）参加者募集開始
http://mag2.living.jp/c/alnhab1ejQs1zkaf""",

    "~ event_01 ~" ->
      """【三鷹】7/9（日）まで「堀尾貞治展 あたりまえのこと 音の形」＠ギャラリー由芽
http://mag2.living.jp/c/alnhab1ejQs1zkag""",

    "~ event_02 ~" ->
      """【堀ノ内】7/2（日）第9回妙法寺夏のふれあい祭り
http://mag2.living.jp/c/alnhab1ejQs1zkah""",
    "~ event_03 ~" ->
      """【武蔵境】夏の収穫祭！7/1（土）は農業ふれあい公園の夏まつりへ
http://mag2.living.jp/c/alnhab1ejQs1zkai""",
    "~ event_04 ~" ->
      """【西荻窪】7/17（月・祝）まで「自然を編む」三人展＠西荻窪
http://mag2.living.jp/c/alnhab1ejQs1zkaj""",

    "~ pickup_01 ~" ->
      """【西荻窪】レトロ系キャラのかわいい雑貨と女子文具なら「Me'sica（ミーシカ）」へ
http://mag2.living.jp/c/alnhab1ejQs1zkak""",

    "~ pickup_02 ~" ->
      """【吉祥寺】駅近穴場カフェでサラダ・スープ・ドリンク付き1000円の充実ランチプレート
http://mag2.living.jp/c/alnhab1ejQs1zkal""",
    "~ blog_01 ~" ->
      """地元のブロガーが紹介する街のグルメ速報をチェック！
【満腹の扉】
http://mag2.living.jp/c/alnhab1ejQs1zkam""",

    "~ blog_02 ~" ->
      """「リビングむさしの」のスタッフが更新中！
【こちら編集室！】
http://mag2.living.jp/c/alnhab1ejQs1zkan"""
  )

  @Test
  def processTest(): Unit = {
    //    processSub(null, 1, ParserCombinator, "", Seq[Map[String, String]]())
    //    processSub(null, 1, ReplaceAll, "", Seq[Map[String, String]]())

    val map1 = Seq[Map[String, String]](
      Map("~ name ~" -> "高田") ++ insMap,
      Map("~ name ~" -> "吉田") ++ insMap,
      Map("~ name ~" -> "広田") ++ insMap,
      Map("~ name ~" -> "村田") ++ insMap,
      Map("~ name ~" -> "中田") ++ insMap,
      Map("~ name ~" -> "西田") ++ insMap,
      Map("~ name ~" -> "黒田") ++ insMap,
      Map("~ name ~" -> "川田") ++ insMap,
      Map("~ name ~" -> "宮田") ++ insMap,
      Map("~ name ~" -> "城田") ++ insMap
    )
    val map11 = map1.map(_ ++ insMap)

    (0 to 10).foreach {
      tryNo =>
        Seq(10, 100, 1000, 10000, 100000, 1000000).foreach {
          mul =>
            processSub("pc", 1, tryNo, mul, ParserCombinator, ins1, map1)
            processSub("ra", 1, tryNo, mul, ReplaceAll, ins1, map1)
            processSub("pc", 11, tryNo, mul, ParserCombinator, ins11, map11)
            processSub("ra", 11, tryNo, mul, ReplaceAll, ins11, map11)
        }
    }
  }

  private[this] def processSub(header: String, ins: Int, tryNo: Int, mul: Int, factory: BodyFactory, body: String, maps: Seq[Map[String, String]]): Unit = {
    System.gc()
    val start = System.currentTimeMillis()
    val executer = factory.prepare(body)
    val prepEnd = System.currentTimeMillis()
    (0 until mul).par.foreach {
      _ =>
        maps.foreach(map => executer.process(map))
    }
    val end = System.currentTimeMillis()
    if (null == header) return
    println(s"$tryNo\t$header\t${mul * 10}\t$ins\t${prepEnd - start}\t${end - prepEnd}")
  }

}
